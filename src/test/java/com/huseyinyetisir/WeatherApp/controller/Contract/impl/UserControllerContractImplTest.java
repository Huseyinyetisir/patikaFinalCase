package com.huseyinyetisir.WeatherApp.controller.Contract.impl;


import com.huseyinyetisir.WeatherApp.controller.contract.impl.UserControllerContractImpl;
import com.huseyinyetisir.WeatherApp.dto.user.UserDTO;
import com.huseyinyetisir.WeatherApp.dto.user.UserSaveRequest;
import com.huseyinyetisir.WeatherApp.entity.AppUser;
import com.huseyinyetisir.WeatherApp.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserControllerContractImplTest {

  @Mock
  private UserService userService;

  @InjectMocks
  private UserControllerContractImpl userControllerContract;

  @Test
  void shouldFindAll() {
    List<UserDTO> userDTOList = userControllerContract.findAll();
    assertEquals(0, userDTOList.size());
  }

  @Test
  void shouldFindAllWhenReturnsUser() {

    String name = "hüseyin";

    AppUser user = mock(AppUser.class);
    when(user.getName()).thenReturn(name);
    List<AppUser> userList = new ArrayList<>();
    userList.add(user);

    when(userService.findAll()).thenReturn(userList);

    List<UserDTO> userDTOList = userControllerContract.findAll();

    assertEquals(1, userDTOList.size());
    AppUser result = userList.get(0);
    assertEquals(name, result.getName());
  }

  @Test
  void shouldFindAllWhenReturnsUsers() {

    AppUser user1 = mock(AppUser.class);
    AppUser user2 = mock(AppUser.class);
    List<AppUser> userList = new ArrayList<>();
    userList.add(user1);
    userList.add(user2);

    when(userService.findAll()).thenReturn(userList);

    List<UserDTO> userDTOList = userControllerContract.findAll();
    assertEquals(2, userDTOList.size());
  }

  @Test
  void shouldSave() {

    Long id = 18L;
    String name = "bahadir";

    UserSaveRequest request = mock(UserSaveRequest.class);
    AppUser user = mock(AppUser.class);
    when(user.getId()).thenReturn(id);

    when(request.name()).thenReturn(name);
    when(userService.save(any())).thenReturn(user);

    UserDTO result = userControllerContract.save(request);

    Mockito.verify(userService).save(any());
    assertEquals(name, result.name());

  }

  @Test
  void shouldNotSaveWhenIdDoesNotExist() {
  }

}