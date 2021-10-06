package by.epam.jwd.testingApp.service.testSortingService;

import by.epam.jwd.testingApp.entities.Test;
import by.epam.jwd.testingApp.exceptions.ServiceException;
import by.epam.jwd.testingApp.service.entitiesService.factory.EntitiesServiceFactory;

import java.util.List;

public class TestsSorterByDate implements TestsSorter{
    @Override
    public List<Test> doSorting(Integer sortParameter, int offset, boolean desc, int limit) throws ServiceException {
        if(sortParameter == null){
            return EntitiesServiceFactory.getInstance().getTestService().
                    sortByCreationDate(offset, desc,limit);
        }
        return EntitiesServiceFactory.getInstance().getTestService().
                sortByCreationDate(sortParameter, offset, desc,limit);
    }
}