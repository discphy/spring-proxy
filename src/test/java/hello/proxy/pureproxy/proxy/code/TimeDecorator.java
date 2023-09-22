package hello.proxy.pureproxy.proxy.code;

import hello.proxy.pureproxy.decorator.code.Component;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TimeDecorator implements Component {

	private Component component;

	public TimeDecorator(Component component) {
		this.component = component;
	}

	@Override
	public String operation() {
		log.info("TimeDecorator 실행");

		long startTime = System.currentTimeMillis();

		String result = component.operation();

		long endTime = System.currentTimeMillis();

		log.info("TimeDecorator 종료 resultTime={}ms", endTime - startTime);

		return result;
	}
}
