package Observer.Observer;

import Observer.Observer.Model.Estoque;
import Observer.Observer.Model.Gerente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.function.BiFunction;

@SpringBootApplication
public class ObserverApplication {

	public static void main(String[] args) {

		SpringApplication.run(ObserverApplication.class, args);

		BigDecimal valorInicial = new BigDecimal("1100.00");
		BigDecimal ValorDesconto = new BigDecimal("10.00");
		Gerente gerente = new Gerente("João");
		Estoque estoque = new Estoque("Camiseta", valorInicial, ValorDesconto);
		estoque.attach(gerente);
		estoque.setValor(valorInicial);
	}

}
