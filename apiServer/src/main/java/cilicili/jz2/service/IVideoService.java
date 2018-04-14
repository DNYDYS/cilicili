package cilicili.jz2.service;

import cilicili.jz2.pojo.Video;

import java.util.List;

public interface IVideoService {
	Video findVideoById(int id);
	
	Video findVideoByUrl(String url);
	
	void addVideo(Video video);
	
	void updateVideo(Video video);
	
	List<Video> showVideos();
}