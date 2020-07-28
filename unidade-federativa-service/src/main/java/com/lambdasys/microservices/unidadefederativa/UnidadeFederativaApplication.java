package com.lambdasys.microservices.unidadefederativa;

import java.io.Serializable;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/data")
@SuppressWarnings("serial")
public class UnidadeFederativaApplication extends Application implements Serializable {

}
