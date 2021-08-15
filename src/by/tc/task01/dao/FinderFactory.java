package by.tc.task01.dao;

import by.tc.task01.dao.impl.Finder;

public final class FinderFactory {
	private static final FinderFactory instance = new FinderFactory();
	private final Finder finder = new Finder();
	
	private FinderFactory() {}
	
	public static FinderFactory getInstance() {
		return instance;
	}
	
	public Finder getFinder() {
		return finder;
	}

}
