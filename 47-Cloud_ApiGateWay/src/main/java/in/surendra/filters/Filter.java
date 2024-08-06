package in.surendra.filters;

import java.util.List;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

public class Filter implements GlobalFilter{
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		System.out.println("Filters() executed...");
		
		ServerHttpRequest request = exchange.getRequest();
		HttpHeaders headers = request.getHeaders();
		
//		if(!headers.containsKey("token")) {
//			throw new RuntimeException("Invalid request");
//		}
		
		if(!headers.containsKey("secret")) {
			throw new RuntimeException("Invalid Request");
		}
		
		List<String> list = headers.get("secret");
		if(!list.get(0).equals("ashokit@123")) {
			throw new RuntimeException("Invalid Token");
		}
		
		return chain.filter(exchange);
		
	}
	
}
