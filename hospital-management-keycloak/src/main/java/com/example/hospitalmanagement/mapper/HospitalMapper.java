package com.example.hospitalmanagement.mapper;

import com.example.hospitalmanagement.dto.HospitalDto;
import com.example.hospitalmanagement.entity.Hospital;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter

@Component
public class HospitalMapper {

    public HospitalDto maptoHospitalDto(Hospital hospital){

        return new HospitalDto(
                hospital.getH_id(),
                hospital.getH_name(),
                hospital.getLocation(),
                hospital.getContact_no(),
                hospital.getEmail()
        );
    }

    public Hospital maptoHospital(HospitalDto hospitalDto){

        return new Hospital(
                hospitalDto.getH_id(),
                hospitalDto.getH_name(),
                hospitalDto.getLocation(),
                hospitalDto.getContact_no(),
                hospitalDto.getEmail()
        );
    }
}
