package com.huseyinyetisir.WeatherApp.controller;

import com.huseyinyetisir.WeatherApp.controller.contract.UserControllerContract;
import com.huseyinyetisir.WeatherApp.dto.user.UserDTO;
import com.huseyinyetisir.WeatherApp.dto.user.UserSaveRequest;
import com.huseyinyetisir.WeatherApp.dto.user.UserUpdateRequest;
import com.huseyinyetisir.WeatherApp.general.RestResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class UserController {

    private final UserControllerContract userControllerContract;

    @PostMapping
    public ResponseEntity<RestResponse<UserDTO>> save(@RequestBody UserSaveRequest request){
        UserDTO userDTO = userControllerContract.save(request);
        return ResponseEntity.ok(RestResponse.of(userDTO));
    }


    @GetMapping("/{id}")
    public ResponseEntity<RestResponse<UserDTO>> findById(@PathVariable Long id){
        UserDTO user = userControllerContract.findById(id);
        return ResponseEntity.ok(RestResponse.of(user));
    }

    @GetMapping("/username/{username}")
    public ResponseEntity<RestResponse<UserDTO>> findByUsername(@PathVariable String username){
        UserDTO user = userControllerContract.findByUsername(username);
        return ResponseEntity.ok(RestResponse.of(user));
    }

    @PutMapping("/{username}")
    public ResponseEntity<RestResponse<UserDTO>> update(@PathVariable String username, @RequestBody UserUpdateRequest request){
        UserDTO user = userControllerContract.update(username, request);
        return ResponseEntity.ok(RestResponse.of(user));
    }
}
