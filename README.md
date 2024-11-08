# Patika Store

Patika Store is a console-based inventory management application developed for a technology store that sells two types of products: **Notebooks** and **Mobile Phones**. This project enables users to add, view, and manage product information efficiently, helping store managers keep track of inventory with ease.

## Project Overview

The primary goal of Patika Store is to create an easy-to-use system for managing products and their stocks in a technology store setting. The application provides separate functionality for handling **Notebook** and **Mobile Phone** products, including features for adding new products, listing inventory, and keeping track of important details.

## Features

- **Add Products**: Allows the user to enter essential information for Notebooks and Mobile Phones.
- **Inventory Tracking**: Displays all available products, organized by category.
- **Brand Sorting**: Lists brands in alphabetical order for easy browsing.
- **Auto-generated IDs**: Each Mobile Phone added to the inventory receives a unique ID based on the existing product count.

## Product Details

1. **Notebook**
    - Fields: ID, Product Name, Price, Brand, Storage, Screen Size, RAM.
    - The user can input each of these fields when adding a new Notebook to the system.

2. **Mobile Phone**
    - Fields: ID, Product Name, Price, Brand, Storage, Screen Size, RAM, Battery Power, Color.
    - Mobile Phone entries automatically generate an incremental ID based on the number of Mobile Phones already in the system.

## Getting Started

### Prerequisites

- **Java 8** or higher must be installed on your system.
- An IDE like **IntelliJ IDEA** or **Eclipse** for running the Java application, or you can use the command line.

### Installation

1. Clone this repository to your local machine.
   ```bash
   git clone <repository-url>
2. Open the project in your preferred Java IDE.
3. Build and run the project.

## Example Output

```plaintext
Notebook List
----------------------------------------------------------------------------------------------------
| ID | Product Name                   | Price     | Brand     | Storage   | Screen    | RAM        |
----------------------------------------------------------------------------------------------------
| 1  | HUAWEI Matebook 14             | 7000.0 TL | Huawei    | 512       | 14.0      | 16         |
| 2  | LENOVO V14 IGL                 | 3699.0 TL | Lenovo    | 1024      | 14.0      | 8          |
| 3  | ASUS Tuf Gaming                | 8199.0 TL | Asus      | 2048      | 15.6      | 32         |
----------------------------------------------------------------------------------------------------
