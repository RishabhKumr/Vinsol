import java.util.Scanner;   
class Sample 
{ 
static int getProfit(int price[], int i, int n) 
{ 
    if (n <= i) 
        return 0;  
    int temp = 0; 

    for (int j= i; j < n; j++)  
    { 
        for (int k = j + 1; k <= n; k++) 
        { 
            if (price[k] > price[j])  
            { 
                int currentProfit = price[k] - price[j] + getProfit(price, i, j - 1) + getProfit(price, k + 1, n); 
                temp = Math.max(temp, currentProfit); 
            } 
        } 
    } 
    return temp; 
} 
public static void main(String[] args) 
{ 
    int price[] = { 1,2,3,4,5,6,7,8,9};
    int n = price.length; 
    System.out.print(getProfit(price, 0, n - 1)); 
} 
} 