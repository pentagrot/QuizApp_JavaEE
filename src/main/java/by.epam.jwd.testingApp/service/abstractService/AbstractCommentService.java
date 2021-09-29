package by.epam.jwd.testingApp.service.abstractService;

import by.epam.jwd.testingApp.entities.Comment;

import by.epam.jwd.testingApp.exceptions.ServiceException;
import by.epam.jwd.testingApp.service.abstractService.genericAbstractService.GenericAbstractService;

import java.util.List;

public interface AbstractCommentService extends GenericAbstractService<Comment,Integer> {
     List<Comment> selectEntityByTestId(Integer testId)throws ServiceException;
}