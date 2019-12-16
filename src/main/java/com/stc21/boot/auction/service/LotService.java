package com.stc21.boot.auction.service;

import com.stc21.boot.auction.dto.LotDto;
import com.stc21.boot.auction.entity.Lot;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.Authentication;
import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface LotService {
    List<Lot> getAllLots();

    List<Lot> getAllLotsByUsername(Authentication token);

    void updateAllLots(List<Lot> lots);
    Page<LotDto> getPageOfHomePageLots(int page);
    Page<LotDto> getPaginated(Pageable pageable);
    Page<LotDto> getPaginatedEvenDeleted(Pageable pageable);
    LotDto convertToDto(Lot lot);
    void setDeletedTo(long id, boolean newValue);
    Lot saveNewLot(LotDto lotDto, Authentication token, MultipartFile[] images);
    LotDto findById(long id);
}
