package com.gerenciador.crud.reuniao.gerenciadorreuniao.repository;

import com.gerenciador.crud.reuniao.gerenciadorreuniao.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long> {


}
