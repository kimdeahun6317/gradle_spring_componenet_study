package gradle_spring_component_study.spring;

public class Main {
	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		MemberRegisterService regSvc = new MemberRegisterService();
		ChangePaswordService pwdSvc = new ChangePaswordService();
	}
}
