package com.example.batchprocessing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BatchProcessingApplication {

	public static void main(String[] args) throws Exception {
		System.exit(SpringApplication.exit(SpringApplication.run(BatchProcessingApplication.class, args)));
	}

	/**
	 * url -> https://jooy-p.tistory.com/35
	 * 1. processor에서 Exception이 발생하면 배치를 처음부터 다시 돌린다.
	 * 2. skip은 어떤 익셉션 클래스를 받을 때 스킵할껀지 설정해주는 것이고
	 * 3. skipLimit는 최대 몇 번의 exception까지 허용할 것인지 정해주는 것
	 * 4. exception이 발생한 건에 대해서는 skip하고 다시 처음 부터 돌리는 것이다.
	 * 5. exception을 발생시킨 건은 무시하고 다른 건을 돌린다.
	 */
	/**
	 * 랜덤 인트 뽑기
	 * int randomNum = ThreadLocalRandom.current().nextInt(:min, :max + 1);
	 */

}
