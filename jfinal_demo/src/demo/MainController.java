package demo;

import com.jfinal.core.Controller;

public class MainController extends Controller {
	public void index()
	{
		  render("/view/index.html");
	}

}
