import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.preprocessing import LabelEncoder
import matplotlib.pyplot as plt
import numpy as np

# Load the data
file_path = 'D:\\asm2_BPS\\Website Access Category.csv'
data = pd.read_csv(file_path)

# Convert 'Date' column to datetime
data['Date'] = pd.to_datetime(data['Date'])

# Extract features: Day of the year, month, and total amount
data['DayOfYear'] = data['Date'].dt.dayofyear
data['Month'] = data['Date'].dt.month

# Prepare the feature matrix X and target vector y
X = data[['DayOfYear', 'Month']]
y = data['TotalAmount']

# Split the data into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=0)

# Create and train the model
model = LinearRegression()
model.fit(X_train, y_train)

# Predict future growth
future_dates = pd.date_range(start='2024-09-01', end='2024-12-31')
future_data = pd.DataFrame({
    'Date': future_dates,
    'DayOfYear': future_dates.dayofyear,
    'Month': future_dates.month
})
future_predictions = model.predict(future_data[['DayOfYear', 'Month']])

# Plot historical and predicted data
plt.figure(figsize=(12, 6))
# Plot historical data
plt.plot(data['Date'], data['TotalAmount'], label='Historical Data', color='blue')
# Plot future predictions
plt.plot(future_dates, future_predictions, label='Future Predictions', color='red', linestyle='--')
plt.xlabel('Date')
plt.ylabel('Total Amount')
plt.title('Growth Projection')
plt.legend()
plt.grid(True)
plt.show()
