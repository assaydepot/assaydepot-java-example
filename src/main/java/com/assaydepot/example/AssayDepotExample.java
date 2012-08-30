package com.assaydepot.example;


import com.assaydepot.AssayDepot;
import com.assaydepot.AssayDepotFactory;
import com.assaydepot.conf.Configuration;
import com.assaydepot.result.Provider;
import com.assaydepot.result.ProviderRef;
import com.assaydepot.result.Results;

public class AssayDepotExample {

	public static void main( String args[] ) {
		try {
			Configuration conf = new Configuration();
			conf.setUrl( new java.net.URL( args[0] ) );
			conf.setApiToken( args[1] );
			AssayDepot assayDepot = AssayDepotFactory.getAssayDepot( conf );
			Results results = assayDepot.getProviderRefs( args[2] );
			for( ProviderRef ref : results.getProviderRefs() ) {
				Provider provider = assayDepot.getProvider( ref.getId() );
				System.out.println( "provider = ["+provider.getName()+"]" );
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
