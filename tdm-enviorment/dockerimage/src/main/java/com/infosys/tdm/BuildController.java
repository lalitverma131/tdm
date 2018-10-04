package com.infosys.tdm;

import java.net.URI;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spotify.docker.client.DefaultDockerClient;

@RestController
public class BuildController {

	@RequestMapping(path = "/build/checkConnection", method = RequestMethod.POST)
	public void checkConnection(@RequestBody String host) {
		DefaultDockerClient.builder().uri(URI.create("tcp://192.168.99.100:2376")).build();
		System.out.println(host + "chala");
	}
}
