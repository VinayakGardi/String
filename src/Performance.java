public class Performance {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        String ans ="";
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);            // not efficient because it is creating new string every time which is memory consuming
            ans+=ch+" ";
        }
        System.out.println(ans);

        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            System.out.print(ch+" ");
        }

        for(int i=0;i<26;i++){
            int ch = ('a'+i);
            System.out.print(ch+" ");
        }
        System.out.println();
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);      // using string builder don't create a new object for string instead modifies it so no wastage of memory
            sb.append(ch+" ");
        }
        System.out.print(sb);

    }
}
