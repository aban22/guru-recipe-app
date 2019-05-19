package guru.springframework.gururecipeapp.services;

import java.util.Set;

import guru.springframework.gururecipeapp.commands.UnitOfMeasureCommand;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();

}