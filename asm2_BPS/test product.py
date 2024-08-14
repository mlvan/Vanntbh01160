import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error
import matplotlib.pyplot as plt
import seaborn as sns
import joblib
# Load the CSV data
file_path = r'D:\asm2_BPS\Product Group.csv'
data = pd.read_csv(file_path)
# Inspect data
print(data.head())
print(data.info())
# Feature selection
X = data[['Marketing Spend', 'Previous Sales']]  # Replace with actual predictors
y = data['Revenue']  # Replace with actual target
# Split the data
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)
# Train a Linear Regression model
model = LinearRegression()
model.fit(X_train, y_train)
# Make predictions
y_pred = model.predict(X_test)
# Evaluate the model
mse = mean_squared_error(y_test, y_pred)
r2 = model.score(X_test, y_test)
print(f'Mean Squared Error: {mse}')
print(f'R² Score: {r2}')
# Visualize the results
plt.figure(figsize=(10, 6))
sns.scatterplot(x=y_test, y=y_pred)
plt.xlabel('Actual Revenue')
plt.ylabel('Predicted Revenue')
plt.title('Actual vs Predicted Revenue')
plt.show()
# Save the model
joblib.dump(model, r'D:\asm2_BPS\revenue_prediction_model.pkl')
