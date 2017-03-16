package jsonsdata;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.PrintWriter;

/**
 * Servlet implementation class StringJson
 */
@WebServlet("/StringJson")
public class StringJson extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StringJson() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	    JSONObject jsonString = new JSONObject();

	    try{
	    	jsonString.put("name","Abhay Kumar");
	        jsonString.put("company","Quantum Four");
	        jsonString.put("location", "Mumbai");
	    }
	    catch (Exception e) {
			// TODO: handle exception
		}
        
        

	
	    
		int[] ids = { 100, 200, 300 };
//	    JSONObject mainObject = new JSONObject();
	    JSONArray recipients = new JSONArray();
	    int i = 0;
	    try{
	    	 for (int id : ids) {
	 	        JSONObject idsJsonObject = new JSONObject();
	 	        String key = "num"+i++ ;
	 	     
	 	        idsJsonObject.put(key, id);
	 	        idsJsonObject.put(key+10, id*10);
	 	        recipients.put(idsJsonObject);
	 	    }
	 	    jsonString.put("recipients", recipients);
	    }
	    catch(Exception e){
	    	
	    }
	   
		// Get the printwriter object from response to write the required json object to the output stream      
		PrintWriter out = response.getWriter();
		// Assuming your json object is **jsonObject**, perform the following, it will return your json object  
		out.print(jsonString);
		out.flush();
		
//		
//		response.getWriter().append(jsonString.toString()).append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
