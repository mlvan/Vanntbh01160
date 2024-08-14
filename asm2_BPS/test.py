import pandas as pd
# Read CSV file into DataFrame
df = pd.read_csv('file_name.csv')
# Display data
print(df)


print(df.info())  # Check the number of rows, columns and data type of each column



# Fill all missing cells with 0
df_filled = df.fillna(0)
# Fill in the average value of the column for the missing cells in each column
df_filled = df.fillna(df.mean())
# Fill in the median value of the column
df_filled = df.fillna(df.median())
# Fill in the mode value (the value that appears most often)
df_filled = df.fillna(df.mode().iloc[0])


import pandas as pd
# Step 1: Read the CSV file into a DataFrame
df = pd.read_csv('your_file.csv')
# Step 2: Remove duplicate rows
df_cleaned = df.drop_duplicates()
# Optional: Remove duplicates based on specific columns
# df_cleaned = df.drop_duplicates(subset=['column1', 'column2'])
# Step 3: Save the cleaned DataFrame back to a CSV file
df_cleaned.to_csv('cleaned_file.csv', index=False)
# Optional: Check the number of rows before and after cleaning
print(f"Original number of rows: {len(df)}")
print(f"Number of rows after removing duplicates: {len(df_cleaned)}")


import pandas as pd
# Read the CSV file into a DataFrame
df = pd.read_csv('your_file.csv')
# Identify rows with negative values
negative_values = df[df < 0].any(axis=1)
negative_rows = df[negative_values]
print("Rows with negative values:")
print(negative_rows)


import pandas as pd
import re
# Read the CSV file into a DataFrame
df = pd.read_csv('your_file.csv')
# Define a function to remove special characters
def remove_special_characters(text):
    if isinstance(text, str):
        return re.sub(r'[^A-Za-z0-9\s]+', '', text)
    return text
# Apply the function to all columns in the DataFrame
df_cleaned = df.applymap(remove_special_characters)
# Save the cleaned DataFrame back to a CSV file
df_cleaned.to_csv('cleaned_file.csv', index=False)




import pandas as pd
import matplotlib.pyplot as plt
# File path
file_path = r"D:\asm2_BPS\customer.csv"
# Read the CSV file
customer_data = pd.read_csv(file_path)
# Extract city and purchase columns (assuming they are named 'City' and 'Purchases')
city_purchase_data = customer_data.groupby('City')[''].sum()
# Plotting the pie chart
plt.figure(figsize=(8,8))
city_purchase_data.plot.pie(autopct='%1.1f%%', startangle=140, colors=['#ff9999','#66b3ff','#99ff99','#ffcc99','#c2c2f0'])
plt.title('Customer Purchases by City')
plt.ylabel('')  # Hide the y-label
plt.show()
