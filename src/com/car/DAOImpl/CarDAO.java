package com.car.DAOImpl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.DAO.util.ConnectionUtils;
import com.IDAO.generic.IDAO;
import com.car.entityAndEnum.Car;

public class CarDAO implements IDAO<Car> {

	ConnectionUtils cnUtil = new ConnectionUtils();

	@Override
	public int create(Car e) throws Exception {

		String query = "Insert into Car values ('" + e.getMatricule() + "','" + e.getMarque() + "','" + e.getCarType()
				+ "')";

		return cnUtil.executeUpdate(query);
	}

	@Override
	public int update(String mat, Car e) throws Exception {

		String query = "Update Car set marque='" + e.getMarque() + "',carType='" + e.getCarType()
				+ "' where matricule='" + e.getMatricule() + "'";

		return cnUtil.executeUpdate(query);

	}

	@Override
	public Car getOne(String mat) throws Exception {
		String query = " Select * from Car where matricule = '" + mat + "'";
		ResultSet rs = cnUtil.executeQuery(query);
		Car c = new Car();
		while (rs.next()) {
			c.setMatricule(rs.getString("matricule"));
			c.setMarque(rs.getString("marque"));
			c.setCarType(rs.getString("CarType"));
		}
		return c;
	}

	@Override
	public int delete(String mat) throws Exception {
		String q = "delete from Car where matricule = '" + mat + "'";
		return cnUtil.executeUpdate(q);
	}

	@Override
	public List<Car> getAll() throws Exception {

		String q = "Select * from Car";
		ResultSet rs = cnUtil.executeQuery(q);
		Car c = new Car();
		List<Car> cars = new ArrayList<Car>();
		while (rs.next()) {

			c.setMatricule(rs.getString("matricule"));
			c.setMarque(rs.getString("marque"));
			c.setCarType(rs.getString("CarType"));

			cars.add(c);
		}

		return cars;
	}

}
