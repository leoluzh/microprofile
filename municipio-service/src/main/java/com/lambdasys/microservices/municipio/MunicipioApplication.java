package com.lambdasys.microservices.municipio;

import java.io.Serializable;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/data")
@SuppressWarnings("serial")
public class MunicipioApplication extends Application implements Serializable {

}
