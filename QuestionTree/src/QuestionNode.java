
public class QuestionNode {
	String data;
	QuestionNode yes;
	QuestionNode no;
	
	public QuestionNode (String data) {
		this(data, null, null);
	}
	
	public QuestionNode (String data, QuestionNode yes, QuestionNode no) {
		this.data = data;
		this.yes = yes;
		this.no = no;
	}
}
