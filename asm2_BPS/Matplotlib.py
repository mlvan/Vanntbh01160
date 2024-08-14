import matplotlib.pyplot as plt
import pandas as pd

# Load CSV data
file_path = r'D:\asm2_BPS\Product Group.csv'
data = pd.read_csv(file_path)

# Inspect data
print(data.head())

# Plotting
plt.figure(figsize=(10, 6))
plt.bar(data['Product Group'], data['Sales'])  # Replace 'Sales' with the actual column name
plt.xlabel('Product Group')
plt.ylabel('Sales')
plt.title('Sales by Product Group')
plt.xticks(rotation=45)
plt.tight_layout()
plt.show()

# Save the plot
plt.savefig(r'D:\asm2_BPS\product_group_sales_plot.png')
