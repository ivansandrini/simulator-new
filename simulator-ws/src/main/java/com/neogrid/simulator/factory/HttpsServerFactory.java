package com.neogrid.simulator.factory;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

import com.sun.net.httpserver.HttpsConfigurator;
import com.sun.net.httpserver.HttpsServer;

public class HttpsServerFactory {
	
	private HttpsServer httpsServer;
	
	public HttpsServerFactory() {
		try {
			init("localhost");
		} catch (UnrecoverableKeyException | KeyManagementException | NoSuchAlgorithmException | KeyStoreException
				| CertificateException | IOException e) {
			e.printStackTrace();
		}
	}
	
	private void init(final String hostname) throws UnrecoverableKeyException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, CertificateException, IOException {
        SSLContext ssl = getSSLContext();
 
        //Init a configuration with our SSL context
        HttpsConfigurator configurator = new HttpsConfigurator(ssl);
 
        //Create a server on localhost, port 443 (https port)
        httpsServer = HttpsServer.create(new InetSocketAddress(hostname, 9443), 9443);
        httpsServer.setHttpsConfigurator(configurator);
	}
	
	private SSLContext getSSLContext() throws NoSuchAlgorithmException, KeyStoreException, IOException,
			CertificateException, UnrecoverableKeyException, KeyManagementException {
		SSLContext ssl =  SSLContext.getInstance("TLS");
         
         
        KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm()); 
        KeyStore store = KeyStore.getInstance(KeyStore.getDefaultType());
 
        //Load the JKS file (located, in this case, at D:\keystore.jks, with password 'test'
        store.load(getClass().getResourceAsStream("/.keystore"), "simulador".toCharArray()); 
 
        //init the key store, along with the password 'test'
        kmf.init(store, "simulador".toCharArray());
        KeyManager[] keyManagers = new KeyManager[1];
        keyManagers = kmf.getKeyManagers();
         
        //Init the trust manager factory
        TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
 
        //It will reference the same key store as the key managers
        tmf.init(store);
         
        TrustManager[] trustManagers = tmf.getTrustManagers();
        
        TrustManager tm = new X509TrustManager() {
			
			@Override
			public X509Certificate[] getAcceptedIssuers() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
				// TODO Auto-generated method stub
				
			}
		};
         
         
        ssl.init(null, new TrustManager[] { tm }, new SecureRandom());
		return ssl;
	}
	
	public HttpsServer getServer() {
		return httpsServer;
	}
}
