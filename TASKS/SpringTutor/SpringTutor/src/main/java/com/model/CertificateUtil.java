//package com.model;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.security.GeneralSecurityException;
//import java.security.KeyStore;
//
//import javax.net.ssl.KeyManager;
//import javax.net.ssl.KeyManagerFactory;
//import javax.net.ssl.TrustManager;
//import javax.net.ssl.X509TrustManager;
//import org.apache.cxf.configuration.jsse.TLSClientParameters;
//import org.apache.cxf.frontend.ClientProxy;
//import org.apache.cxf.transport.http.HTTPConduit;
//import org.apache.cxf.transports.http.configuration.ConnectionType;
//import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
//
//
//@SuppressWarnings("restriction")
//public class CertificateUtil
//{
//   
//   public static void setupTLS(Object port) throws FileNotFoundException, IOException, GeneralSecurityException
//   {
//      try
//      {         
//         HTTPConduit httpConduit = (HTTPConduit) ClientProxy.getClient(port).getConduit();
//         TLSClientParameters tlsCP = new TLSClientParameters();
//         KeyStore keyStore = KeyStore.getInstance("JKS");
////         final String keyStoreLoc = System.getProperty("jonas.base") + File.separator + "conf" + File.separator + "meerkat_ssl_conf" + File.separator + "certificate" + File.separator + "kpn.jks";
//         final String keyStoreLoc ="E:/TASKS/callmeerkatservice/meerkat-vdr.jks";
//         final String password = "meerkat";
//         keyStore.load(new FileInputStream(keyStoreLoc), password.toCharArray());
//         KeyManager[] myKeyManagers = getKeyManagers(keyStore, password);
//         tlsCP.setKeyManagers(myKeyManagers);
//         KeyStore trustStore = KeyStore.getInstance("JKS");
//         trustStore.load(new FileInputStream(keyStoreLoc), password.toCharArray());
//         TrustManager[] myTrustStoreKeyManagers = getTrustManagersAllAccept(trustStore);
//         tlsCP.setTrustManagers(myTrustStoreKeyManagers);
//
//         HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
//         httpClientPolicy.setAllowChunking(false);
//         httpClientPolicy.setContentType("text/xml");
//         httpClientPolicy.setConnectionTimeout(120000);
//         httpClientPolicy.setReceiveTimeout(120000);
//         httpClientPolicy.setConnection(ConnectionType.KEEP_ALIVE);
//
//         httpConduit.setClient(httpClientPolicy);
//         tlsCP.setDisableCNCheck(false);
//
//         httpConduit.setTlsClientParameters(tlsCP);
//      }
//      catch (Exception e)
//      {
//    	  e.printStackTrace();
//      }
//   }
//
//   private static TrustManager[] getTrustManagersAllAccept(KeyStore trustStore)
//   {
//      TrustManager[] acceptAll = new TrustManager[] { new X509TrustManager()
//         {
//            public java.security.cert.X509Certificate[] getAcceptedIssuers()
//            {
//               return null;
//            }
//
//            public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) throws java.security.cert.CertificateException
//            {
//               // TODO Auto-generated method stub
//
//            }
//
//            public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) throws java.security.cert.CertificateException
//            {
//               // TODO Auto-generated method stub
//
//            }
//
//         } };
//      return acceptAll;
//
//   }
//
//   private static KeyManager[] getKeyManagers(KeyStore keyStore, String keyPassword) throws GeneralSecurityException, IOException
//   {
//      String alg = KeyManagerFactory.getDefaultAlgorithm();
//      char[] keyPass = keyPassword != null ? keyPassword.toCharArray() : null;
//      KeyManagerFactory fac = KeyManagerFactory.getInstance(alg);
//      fac.init(keyStore, keyPass);
//      return fac.getKeyManagers();
//   }
//   
//}
