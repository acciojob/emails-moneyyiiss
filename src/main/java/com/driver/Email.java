package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        int len = newPassword.length();
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        if(password == oldPassword){
            if(len >= 8){
                for(int i=0; i<len; i++){
                    char val = newPassword.charAt(i);
                    if(Character.isUpperCase(val) && c1 == 0){
                        c1++;
                    }
                    if(Character.isLowerCase(val) && c2 == 0){
                        c2++;
                    }
                    if(Character.isDigit(val) && c3 == 0){
                        c3++;
                    }
                    if((val >= 33 && val <= 47) && c4 == 0){
                        c4++;
                    }
                }
                if(c1 > 0 && c2 > 0 && c3 > 0 && c4 > 0){
                    this.password = newPassword;
                }
            }
        }
    }
}
