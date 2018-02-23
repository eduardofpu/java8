package javaoit8;

/*
////////////////////////download de arquivo ///////////////////////////////////////////////////////////////////////////////

@Override
    public ResponseEntity<Resource> downloadCertificateSandboxFile() {

        byte[] certificate = applicationService.findApplicationPlatformConfByPlatform(Platform.IOS)
                .stream().filter(conf -> conf.getKey().equals(ApplicationPlatformConfKeysTO.APNS_SANDBOX_CERTIFICATE))
                .map(conf -> conf.getValue())
                .findFirst().orElse(null);



        final ByteArrayResource  resource = new ByteArrayResource(certificate);

        final RealwaveContext context = RealwaveContextHolder.getContext();
        final String fileName = String.format("%s-%s-%s.p12", context.getOrganization(), context.getApplication(), "sandbox");

        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename="+fileName);

        return ResponseEntity.ok()
                .headers(headers)
                .contentLength(resource.contentLength())
                .contentType(MediaType.parseMediaType("application/x-pkcs12"))
                .body(resource);
    }


*/

public class Curso {
	
	private String nome;
	private int alunos;
	
	public Curso(String nome, int alunos) {
		
		this.nome = nome;
		this.alunos = alunos;
	}
	public String getNome() {
		return nome;
	}
	
	public int getAlunos() {
		return alunos;
	}
	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", alunos=" + alunos + "]";
	}
	
	
}
