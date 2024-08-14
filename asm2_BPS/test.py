import pandas as pd

# Đọc tệp CSV vào DataFrame
df = pd.read_csv('ten_tep.csv')

# Hiển thị dữ liệu
print(df)


print(df.info())  # Kiểm tra số lượng hàng, cột và kiểu dữ liệu của từng cột
# Điền giá trị 0 cho tất cả các ô bị thiếu
df_filled = df.fillna(0)
# Điền giá trị trung bình của cột cho các ô bị thiếu trong từng cột
df_filled = df.fillna(df.mean())
# Điền giá trị median (trung vị) của cột
df_filled = df.fillna(df.median())
# Điền giá trị mode (giá trị xuất hiện nhiều nhất)
df_filled = df.fillna(df.mode().iloc[0])


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
