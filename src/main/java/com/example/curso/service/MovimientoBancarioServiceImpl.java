package com.example.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.curso.dao.IMovimientoBancarioDao;
import com.example.curso.entity.MovimientoBancario;

@Service
public class MovimientoBancarioServiceImpl implements IMovimientoBancarioService{

	@Autowired
	private IMovimientoBancarioDao movimientoBancarioDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<MovimientoBancario> findAll() {
		return (List<MovimientoBancario>) movimientoBancarioDao.findAll();
	}

	@Override
	@Transactional
	public void save(MovimientoBancario movimientoBancario) {
		movimientoBancarioDao.save(movimientoBancario);
	}

	@Override
	@Transactional(readOnly = true)
	public List<MovimientoBancario> getMovivimientoUser(Long id) {
		return (List<MovimientoBancario>) movimientoBancarioDao.findByUserId(id);
	}
	
}
