package com.serena.sbm.ws;

import com.serena.sbm.ws.client.Auth;
import com.serena.sbm.ws.client.Sbmappservices72_BindingStub;
import com.serena.sbm.ws.client.Sbmappservices72_ServiceLocator;

import javax.xml.rpc.ServiceException;
import java.net.URL;

/**
 * Created by ozozulenko on 3/31/2017.
 */
public class SbmWebServiceClient {

    Sbmappservices72_BindingStub binding;
    String defaultWSEndpoint = "http://orl-qa-vstst67:82/gsoap/gsoap_ssl.dll?sbmappservices72";

    Auth auth = new Auth();

   boolean isServiceConnected;

    public boolean isServiceConnected() {
        return isServiceConnected;
    }

    public void setServiceConnected(boolean serviceConnected) {
        isServiceConnected = serviceConnected;
    }

    public Sbmappservices72_BindingStub getServiceClient(URL endpoint, String authUserName, String authUserPass){

        try {
            binding = (Sbmappservices72_BindingStub)             new Sbmappservices72_ServiceLocator().getsbmappservices72(endpoint);

        // Time out after a minute
        binding.setTimeout(60000);

        auth.setUserId(authUserName);
        auth.setPassword(authUserPass);
        } catch (ServiceException e) {

            e.printStackTrace();
        }
        return binding;
    }
}
