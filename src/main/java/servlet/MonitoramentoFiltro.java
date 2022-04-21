package servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;



public class MonitoramentoFiltro implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		Long antes = System.currentTimeMillis();
		
		String paramAcao = request.getParameter("acao");
		
		chain.doFilter(request, response);
		
		Long depois = System.currentTimeMillis();
		System.out.println("Filtro MF # " + paramAcao + " # " + (depois - antes));
	}
    
}
