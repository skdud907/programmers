class Solution {
    public String solution(String phone_number) {
        String first_number = phone_number.substring(0, phone_number.length()-4);
        String end_number = phone_number.substring(phone_number.length()-4, phone_number.length());
        
        return first_number.replaceAll("[0-9]", "*")+end_number;
    }
}