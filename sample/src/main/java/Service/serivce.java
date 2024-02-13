package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.RPLEntity;
import Repository.Repository;

@Service
public class serivce {

	@Autowired
	private Repository repo;
	
	public List<RPLEntity> executeQuery(String query){
		List<RPLEntity> result= repo.customQuery(query);
		return result;
	}
	
	
}
