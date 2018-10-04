package com.infosys.tdm;

import java.net.URI;
import java.nio.file.Paths;

import com.spotify.docker.client.DefaultDockerClient;
import com.spotify.docker.client.DockerCertificates;
import com.spotify.docker.client.DockerClient;
import com.spotify.docker.client.DockerClient.ListContainersParam;
import com.spotify.docker.client.exceptions.DockerCertificateException;
import com.spotify.docker.client.exceptions.DockerException;
import com.spotify.docker.client.messages.Container;

public class TEST2 {

	public static void main(String[] args) throws DockerException, InterruptedException, DockerCertificateException {
		DockerClient docker = DefaultDockerClient.builder().uri(URI.create("https://192.168.99.100:2376"))
				.dockerCertificates(
						new DockerCertificates(Paths.get("C://Users//Verma//.docker//machine//machines//default")))
				.build();
		docker.pull("mysql");
		docker.close();
		// docker.pull("ubuntu");

	}

}
