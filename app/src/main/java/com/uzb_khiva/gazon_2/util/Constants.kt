package com.uzb_khiva.gazon_2.util


import com.uzb_khiva.gazon_2.model.Card
import com.uzb_khiva.gazon_2.model.Placed

/*
val id: Int,
    val maydonNomi: String,
    val manzil: String,
    val sana:String,
    val vaqt:String,
    val rate:String,
    val narx:String,
    val imageList: List<String>
 */
val placeds = listOf(
    Placed(
        id = 1,
        maydonNomi = "Stadium Beldors",
        manzil = "Bobur St. 124",
        sana = "02.05.2024",
        vaqt = "Mon-Sun/8:00-20:00",
        rate = "3.8",
        narx = "50000",
        imageList = listOf(
            "https://s3-alpha-sig.figma.com/img/81cd/01a4/d1d7c1fdd2eb72185a4bcf4140edf43a?Expires=1710720000&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4&Signature=dQlVFr70zzThl7kqftbX~UYcGQe9NqWEPrB63DuAaS2exRwmjxXAUllJHUEn6T2eTMIp42n0Qaw-jpR0~eq72ByzlAGB559NaUycql189L5Pej6uiwmVfPFBQ80741rExNaJfvnFbKPE5gaHZjA4DjR7K-e7-O8~6iU1zJxYwBBlw5RLFxd9kUC4E58yLjy6G03WyBBj59YVpv72eVyir6iDZn9M0QW6cbPeBDn5W77ntRTntDiMGHemtPHEiwDe7rWdCmXY0eloZ15TRVim5Z82lPdfiLBw7vmUWDBmkJPHjDTHD~dYtrOnMTwa1KrCZb83ex5DIInTGEYtGwb6Uw__",
            "https://s3-alpha-sig.figma.com/img/5a64/8a9d/38769f319bebc5248568e9f0b6b4dc60?Expires=1710720000&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4&Signature=Ni3QNkXYcxu09fpHUX~gpabMHGzyUAGbmBBJWR2gaTkLLxwkMhGp3Jk0VL8eMUUmBe~ZJRG9x6T7cC3crLoeenVlBwz9neSrOLvRxc6pLUaKCNnzQ4lCud7wecE5b1FQw7gBO4abKFlAmdznqcd65GlcNKwwHpb2br1pKlobOtNExoLUFL-EgQ-XchP2Xx9w4BpHn3Vk68X78js4-ZNtZGxy~A0LZYZYGv1hg1wZ11XjO2buy54hoaKd6biCXA8OHKYbUEGAUEcFxnI3dT6qXfsMMlF502cGhBtHy90nk86mtV3aSMRL0791M-vh2jV6b-KeET4oHRYmhlO6MlMrTw__",
            "https://s3-alpha-sig.figma.com/img/db7c/cca5/3e56af5db17766d05566332051fdef19?Expires=1710720000&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4&Signature=Q21nvIqyXEV-GK5a3Xr9nYh3MWu8qCyZawrKtM6VSJoES1nv5vxF3dI9QjMFBSnfRue9vX86kaLKX8vZuHvFbxAytFfgbz0z42HfOhrvcdIEy78819C2UL1Tr4tK4Dq0Tupwg08YtbEFixgyiIpnY6vsc1xOvV5-xFWgSo4OgPgo8OU527N5dOkXbTRQlRM25sg5TUstoS81E3j585ylM~oisMrAIwOZt9FLDzFT3c3sxSinMwX6kpnpAu-iT3~GyRCG2zbHPrSQjMPlj~5KnSt01hhp9ojlwFFJxA~aEyDHOujIBfrmKTeG4ypsxU9ks5qN2SYnyj4DsH0Vof0Hdw__",
            "https://s3-alpha-sig.figma.com/img/f15e/49bb/f0ef60dd0fac8910964c683e889a684f?Expires=1710720000&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4&Signature=nMKQ8P00N3RNcbh8pN6Bu~Ey0GfKtc6jPvJY26uSKbZKbCJhR-X9XERV~EV9fsR8yBcTalSSEh2mIUrVeiUA2NhSWtcXbccCXG9mrTHlVYMT6-WO8u5WBADZ~Es4rQbT-L-5h123fAeESnSoQiMwYtW77OGEouxkJ24SVwl3mXhvvBrZGfeJBx2aztuL~fE6UrjXqo6jTxdVMW75iLQsM~6HUeMjCGPcUGQXXsg9S0n5m4uCN2~2JrJqcDGBFn-d-OK8RSJR1Rs2JGE65rb4nl7udFv7F6CJ3jAYTqShWCE7Vz5wj9~CdbynYlLjWq4t-mZ~aiAEq5SWJhVgxrR6hA__"
        )
    ),
    Placed(
        id = 2,
        maydonNomi = "Stadium Bunyodkor",
        manzil = "Bobur St. 124",
        sana = "02.05.2024",
        vaqt = "Mon-Sun/8:00-20:00",
        rate = "3.8",
        narx = "50000",
        imageList = listOf(
            "https://s3-alpha-sig.figma.com/img/5a64/8a9d/38769f319bebc5248568e9f0b6b4dc60?Expires=1710720000&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4&Signature=Ni3QNkXYcxu09fpHUX~gpabMHGzyUAGbmBBJWR2gaTkLLxwkMhGp3Jk0VL8eMUUmBe~ZJRG9x6T7cC3crLoeenVlBwz9neSrOLvRxc6pLUaKCNnzQ4lCud7wecE5b1FQw7gBO4abKFlAmdznqcd65GlcNKwwHpb2br1pKlobOtNExoLUFL-EgQ-XchP2Xx9w4BpHn3Vk68X78js4-ZNtZGxy~A0LZYZYGv1hg1wZ11XjO2buy54hoaKd6biCXA8OHKYbUEGAUEcFxnI3dT6qXfsMMlF502cGhBtHy90nk86mtV3aSMRL0791M-vh2jV6b-KeET4oHRYmhlO6MlMrTw__",
            "https://s3-alpha-sig.figma.com/img/81cd/01a4/d1d7c1fdd2eb72185a4bcf4140edf43a?Expires=1710720000&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4&Signature=dQlVFr70zzThl7kqftbX~UYcGQe9NqWEPrB63DuAaS2exRwmjxXAUllJHUEn6T2eTMIp42n0Qaw-jpR0~eq72ByzlAGB559NaUycql189L5Pej6uiwmVfPFBQ80741rExNaJfvnFbKPE5gaHZjA4DjR7K-e7-O8~6iU1zJxYwBBlw5RLFxd9kUC4E58yLjy6G03WyBBj59YVpv72eVyir6iDZn9M0QW6cbPeBDn5W77ntRTntDiMGHemtPHEiwDe7rWdCmXY0eloZ15TRVim5Z82lPdfiLBw7vmUWDBmkJPHjDTHD~dYtrOnMTwa1KrCZb83ex5DIInTGEYtGwb6Uw__",
            "https://s3-alpha-sig.figma.com/img/db7c/cca5/3e56af5db17766d05566332051fdef19?Expires=1710720000&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4&Signature=Q21nvIqyXEV-GK5a3Xr9nYh3MWu8qCyZawrKtM6VSJoES1nv5vxF3dI9QjMFBSnfRue9vX86kaLKX8vZuHvFbxAytFfgbz0z42HfOhrvcdIEy78819C2UL1Tr4tK4Dq0Tupwg08YtbEFixgyiIpnY6vsc1xOvV5-xFWgSo4OgPgo8OU527N5dOkXbTRQlRM25sg5TUstoS81E3j585ylM~oisMrAIwOZt9FLDzFT3c3sxSinMwX6kpnpAu-iT3~GyRCG2zbHPrSQjMPlj~5KnSt01hhp9ojlwFFJxA~aEyDHOujIBfrmKTeG4ypsxU9ks5qN2SYnyj4DsH0Vof0Hdw__",
            "https://s3-alpha-sig.figma.com/img/f15e/49bb/f0ef60dd0fac8910964c683e889a684f?Expires=1710720000&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4&Signature=nMKQ8P00N3RNcbh8pN6Bu~Ey0GfKtc6jPvJY26uSKbZKbCJhR-X9XERV~EV9fsR8yBcTalSSEh2mIUrVeiUA2NhSWtcXbccCXG9mrTHlVYMT6-WO8u5WBADZ~Es4rQbT-L-5h123fAeESnSoQiMwYtW77OGEouxkJ24SVwl3mXhvvBrZGfeJBx2aztuL~fE6UrjXqo6jTxdVMW75iLQsM~6HUeMjCGPcUGQXXsg9S0n5m4uCN2~2JrJqcDGBFn-d-OK8RSJR1Rs2JGE65rb4nl7udFv7F6CJ3jAYTqShWCE7Vz5wj9~CdbynYlLjWq4t-mZ~aiAEq5SWJhVgxrR6hA__"
        )
    ),
    Placed(
        id = 3,
        maydonNomi = "Stadium Paxtakor",
        manzil = "Bobur St. 124",
        sana = "02.05.2024",
        vaqt = "Mon-Sun/8:00-20:00",
        rate = "3.8",
        narx = "50000",
        imageList = listOf(
            "https://s3-alpha-sig.figma.com/img/db7c/cca5/3e56af5db17766d05566332051fdef19?Expires=1710720000&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4&Signature=Q21nvIqyXEV-GK5a3Xr9nYh3MWu8qCyZawrKtM6VSJoES1nv5vxF3dI9QjMFBSnfRue9vX86kaLKX8vZuHvFbxAytFfgbz0z42HfOhrvcdIEy78819C2UL1Tr4tK4Dq0Tupwg08YtbEFixgyiIpnY6vsc1xOvV5-xFWgSo4OgPgo8OU527N5dOkXbTRQlRM25sg5TUstoS81E3j585ylM~oisMrAIwOZt9FLDzFT3c3sxSinMwX6kpnpAu-iT3~GyRCG2zbHPrSQjMPlj~5KnSt01hhp9ojlwFFJxA~aEyDHOujIBfrmKTeG4ypsxU9ks5qN2SYnyj4DsH0Vof0Hdw__",
            "https://s3-alpha-sig.figma.com/img/81cd/01a4/d1d7c1fdd2eb72185a4bcf4140edf43a?Expires=1710720000&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4&Signature=dQlVFr70zzThl7kqftbX~UYcGQe9NqWEPrB63DuAaS2exRwmjxXAUllJHUEn6T2eTMIp42n0Qaw-jpR0~eq72ByzlAGB559NaUycql189L5Pej6uiwmVfPFBQ80741rExNaJfvnFbKPE5gaHZjA4DjR7K-e7-O8~6iU1zJxYwBBlw5RLFxd9kUC4E58yLjy6G03WyBBj59YVpv72eVyir6iDZn9M0QW6cbPeBDn5W77ntRTntDiMGHemtPHEiwDe7rWdCmXY0eloZ15TRVim5Z82lPdfiLBw7vmUWDBmkJPHjDTHD~dYtrOnMTwa1KrCZb83ex5DIInTGEYtGwb6Uw__",
            "https://s3-alpha-sig.figma.com/img/5a64/8a9d/38769f319bebc5248568e9f0b6b4dc60?Expires=1710720000&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4&Signature=Ni3QNkXYcxu09fpHUX~gpabMHGzyUAGbmBBJWR2gaTkLLxwkMhGp3Jk0VL8eMUUmBe~ZJRG9x6T7cC3crLoeenVlBwz9neSrOLvRxc6pLUaKCNnzQ4lCud7wecE5b1FQw7gBO4abKFlAmdznqcd65GlcNKwwHpb2br1pKlobOtNExoLUFL-EgQ-XchP2Xx9w4BpHn3Vk68X78js4-ZNtZGxy~A0LZYZYGv1hg1wZ11XjO2buy54hoaKd6biCXA8OHKYbUEGAUEcFxnI3dT6qXfsMMlF502cGhBtHy90nk86mtV3aSMRL0791M-vh2jV6b-KeET4oHRYmhlO6MlMrTw__",
            "https://s3-alpha-sig.figma.com/img/f15e/49bb/f0ef60dd0fac8910964c683e889a684f?Expires=1710720000&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4&Signature=nMKQ8P00N3RNcbh8pN6Bu~Ey0GfKtc6jPvJY26uSKbZKbCJhR-X9XERV~EV9fsR8yBcTalSSEh2mIUrVeiUA2NhSWtcXbccCXG9mrTHlVYMT6-WO8u5WBADZ~Es4rQbT-L-5h123fAeESnSoQiMwYtW77OGEouxkJ24SVwl3mXhvvBrZGfeJBx2aztuL~fE6UrjXqo6jTxdVMW75iLQsM~6HUeMjCGPcUGQXXsg9S0n5m4uCN2~2JrJqcDGBFn-d-OK8RSJR1Rs2JGE65rb4nl7udFv7F6CJ3jAYTqShWCE7Vz5wj9~CdbynYlLjWq4t-mZ~aiAEq5SWJhVgxrR6hA__"
        )
    ),
    Placed(
        id = 4,
        maydonNomi = "Stadium Navbakhor",
        manzil = "Bobur St. 124",
        sana = "02.05.2024",
        vaqt = "Mon-Sun/8:00-20:00",
        rate = "3.8",
        narx = "50000",
        imageList = listOf(
            "https://s3-alpha-sig.figma.com/img/f15e/49bb/f0ef60dd0fac8910964c683e889a684f?Expires=1710720000&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4&Signature=nMKQ8P00N3RNcbh8pN6Bu~Ey0GfKtc6jPvJY26uSKbZKbCJhR-X9XERV~EV9fsR8yBcTalSSEh2mIUrVeiUA2NhSWtcXbccCXG9mrTHlVYMT6-WO8u5WBADZ~Es4rQbT-L-5h123fAeESnSoQiMwYtW77OGEouxkJ24SVwl3mXhvvBrZGfeJBx2aztuL~fE6UrjXqo6jTxdVMW75iLQsM~6HUeMjCGPcUGQXXsg9S0n5m4uCN2~2JrJqcDGBFn-d-OK8RSJR1Rs2JGE65rb4nl7udFv7F6CJ3jAYTqShWCE7Vz5wj9~CdbynYlLjWq4t-mZ~aiAEq5SWJhVgxrR6hA__",
            "https://s3-alpha-sig.figma.com/img/81cd/01a4/d1d7c1fdd2eb72185a4bcf4140edf43a?Expires=1710720000&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4&Signature=dQlVFr70zzThl7kqftbX~UYcGQe9NqWEPrB63DuAaS2exRwmjxXAUllJHUEn6T2eTMIp42n0Qaw-jpR0~eq72ByzlAGB559NaUycql189L5Pej6uiwmVfPFBQ80741rExNaJfvnFbKPE5gaHZjA4DjR7K-e7-O8~6iU1zJxYwBBlw5RLFxd9kUC4E58yLjy6G03WyBBj59YVpv72eVyir6iDZn9M0QW6cbPeBDn5W77ntRTntDiMGHemtPHEiwDe7rWdCmXY0eloZ15TRVim5Z82lPdfiLBw7vmUWDBmkJPHjDTHD~dYtrOnMTwa1KrCZb83ex5DIInTGEYtGwb6Uw__",
            "https://s3-alpha-sig.figma.com/img/5a64/8a9d/38769f319bebc5248568e9f0b6b4dc60?Expires=1710720000&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4&Signature=Ni3QNkXYcxu09fpHUX~gpabMHGzyUAGbmBBJWR2gaTkLLxwkMhGp3Jk0VL8eMUUmBe~ZJRG9x6T7cC3crLoeenVlBwz9neSrOLvRxc6pLUaKCNnzQ4lCud7wecE5b1FQw7gBO4abKFlAmdznqcd65GlcNKwwHpb2br1pKlobOtNExoLUFL-EgQ-XchP2Xx9w4BpHn3Vk68X78js4-ZNtZGxy~A0LZYZYGv1hg1wZ11XjO2buy54hoaKd6biCXA8OHKYbUEGAUEcFxnI3dT6qXfsMMlF502cGhBtHy90nk86mtV3aSMRL0791M-vh2jV6b-KeET4oHRYmhlO6MlMrTw__",
            "https://s3-alpha-sig.figma.com/img/db7c/cca5/3e56af5db17766d05566332051fdef19?Expires=1710720000&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4&Signature=Q21nvIqyXEV-GK5a3Xr9nYh3MWu8qCyZawrKtM6VSJoES1nv5vxF3dI9QjMFBSnfRue9vX86kaLKX8vZuHvFbxAytFfgbz0z42HfOhrvcdIEy78819C2UL1Tr4tK4Dq0Tupwg08YtbEFixgyiIpnY6vsc1xOvV5-xFWgSo4OgPgo8OU527N5dOkXbTRQlRM25sg5TUstoS81E3j585ylM~oisMrAIwOZt9FLDzFT3c3sxSinMwX6kpnpAu-iT3~GyRCG2zbHPrSQjMPlj~5KnSt01hhp9ojlwFFJxA~aEyDHOujIBfrmKTeG4ypsxU9ks5qN2SYnyj4DsH0Vof0Hdw__",
        )
    ),
)

val cards = listOf(
    Card(
        number = "1234567890123456",
        bank = "Xalq banki",
        imageUrl = "https://s3-alpha-sig.figma.com/img/663f/c359/0cf16f8b5f353714b1379df31b13cd0b?Expires=1710720000&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4&Signature=esWhdsqLOonNNEebAV54fupp6-nd~WF1aDRSqK0CppSerhRq082T1Ii2TcbBui-uThkHGKU-mmw6wu0SdpibevetWRamfNN6pnHdIbU8LGACAp5AkMx1tJgLt-1pipEqfPTX~pzorCa7q8mBhteX5F6J5OpS-sMuOv4QDCaYH-DfnxBE2unrd6phXtNnGg4bqB4nFFRXWFousRE8nKbfSvoadCVc2VCxWIft1r9mJsoAO4U2grrUkkDNUB5VsWsD63Y~OMAcLCpjE0SOmVXiEV0XN9Tn~6f5dPdmFpFIcwKFBg~XIXgY6qasq69uM6BMLDNjyTU8BF0ya7c4GCg~4w__",
    )
)