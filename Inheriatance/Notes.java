/*
Package in java
-> 
Package is a group of similar types of classes 
Package can be build-in or userDefiend 

2. Access Modifires in Java

1. Private -> acces only same class
2. Default -> Can not access outside 
3. Protected -> only chiled class can access 
4. Public -> Every where can access 
*/

class Account{
    public String name;
    protected String email;
    private String password;

    // getter setter
    
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
this.password=password;

    }

}

public class Notes{
    public static void main(String[] args) {
        Account a1=new Account();
        a1.setPassword("abc");
        System.out.println(a1.getPassword());
    }
}