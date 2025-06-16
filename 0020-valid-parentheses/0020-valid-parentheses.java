class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{'||ch=='['){
                st.push(ch);
            }
            else if(ch==')'|| ch=='}'||ch==']'){
                if(st.isEmpty()|| ismatching(ch,st.peek())==false){
                    return false;
                }
                else{
                    st.pop();
                }

            }
        }
        return st.isEmpty();

        
    }
    public boolean ismatching(char cl,char op){
        if(cl=='}'){
            return op=='{';
        }
        else if(cl==')'){

            return op=='(';
        }
        else if(cl==']'){
            return op=='[';
        }
        else{
            return false;
        }
    }
}