import java.util.ArrayList;
import java.util.HashMap;

public class VoteProcessor {
	
	String calculateElectionWinner(ArrayList<String> votes){
		int countForEd = 0;
		int countForPo = 0;
		for(String vote : votes){
			if(vote.equalsIgnoreCase("pope francis")) countForPo++;
			if(vote.equalsIgnoreCase("edward Snowden")) countForEd++;
		}
		if(countForEd > countForPo) return "Edward Snowden";
		if(countForPo > countForEd) return "pope francis";
		else return "TIE";
	}
	
	
}
