package com.amigoscode.awsimageupload.bucket;

public enum BucketName {
	
	PROFILE_IMAGE("amigoscode-image-upload-0830");
	
	private final String bucketName;

	private BucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public String getBucketName() {
		return bucketName;
	}
	
	
}
