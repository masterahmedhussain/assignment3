package com.crackerfactory;

public class StartOrder  implements Order {
	Worker worker;
	public StartOrder(Worker worker) {
		this.worker = worker;
	}
	public void orderUp() {
		worker.makeRitzCracker();
		worker.makeCheezitCracker();
	}
	}
