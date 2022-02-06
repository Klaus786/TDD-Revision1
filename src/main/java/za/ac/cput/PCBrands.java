package za.ac.cput;

/*

Author: Klaus Traubner
Student Number: 218009496
Date: 04 February 2022
Subject: ADP372S

 */

public class PCBrands

{
    String[] brand, production, discontinued;

    public PCBrands()
    {
        this.brand[0] = "Acer";
        this.brand[1] = "Lenovo";
        this.brand[2]= "Apple";
        this.brand[3] = "Samsung";

        this.production[0] = "8 February 1993";
        this.production[1] = "25 August 1984";
        this.production[2] = "16 October 1978";
        this.production[3] = "18 June 1855";

        this.discontinued[1] = "25 February 2025";
        this.discontinued[2] = "12 December 2012";
        this.discontinued[3] = "18 March 2006";
        this.discontinued[3] = "28 September 2038";


    }

    //Getters
    public String getBrand1() {return brand[0] ; }
    public String getBrand2() {return brand[1] ; }
    public String getBrand3() {return brand[2] ; }
    public String getBrand4() {return brand[3] ; }

    public String getProduction1() {return production[0] ; }
    public String getProduction2() {return production[1] ; }
    public String getProduction3() {return production[2] ; }
    public String getProduction4() {return production[3] ; }

    public String getDiscontinued1() {return discontinued[0] ; }
    public String getDiscontinued2() {return discontinued[1] ; }
    public String getDiscontinued3() {return discontinued[2] ; }
    public String getPDiscontinued4() {return discontinued[3] ; }




// Setters


    public void setBrand1() {this.brand[0] = brand[0]; }
    public void setBrand2() {this.brand[1] = brand[1]; }
    public void setBrand3() {this.brand[2] = brand[2]; }
    public void setBrand4() {this.brand[3] = brand[3]; }

    public void setProduction1() {this.production[0] = production[0]; }
    public void setProduction2() {this.production[1] = production[1]; }
    public void setProduction3() {this.production[2] = production[2]; }
    public void setProduction4() {this.production[3] = production[3]; }

    public void setDiscontinued1() {this.discontinued[0] = discontinued[0]; }
    public void setDiscontinued2() {this.discontinued[1] = discontinued[1]; }
    public void setDiscontinued3() {this.discontinued[2] = discontinued[2]; }
    public void setDiscontinued4() {this.discontinued[3] = discontinued[3]; }

//toString ()

    @Override

    public String toString ()
    {
        return "Below are the Top 4 electronic companies, their production date along with there discontinued date:\n\n" + "1st Place:" + brand[0]
                + ", Production date:" + production[0] + ", Discontinued: " + discontinued[0] + "\n\n" + "2nd Place:" + brand[1]
                + ", Production date:" + production[1] + ", Discontinued: " + discontinued[1] + "\n\n" + "3rd Place:" + brand[2]
                + ", Production date:" + production[2] + ", Discontinued: " + discontinued[2] + "\n\n" + " Place:" + brand[3]
                + ", Production date:" + production[3] + ", Discontinued: " + discontinued[3];
    }
}

