# Copyright (c) 2019 LG Electronics, Inc.

ROS_EXPORT_DEPENDS = " \
    python3-numpy \
"

do_install_append() {
    # - Add <SYSROOT>/<PYTHON-SITE-PACKAGES>/numpy/core/include to the include file search path. XXX Why doesn't this need to be
    #   done under Ubuntu bionic?
    # - HACK: There must be a CMake variable containing the sysroot that could be used instead of $ENV{PKG_CONFIG_SYSROOT_DIR}!!
    # - Use [{] and [}] to prevent bitbake from attempting to expand ${CMAKE_CURRENT_BINARY_DIR} in the regex. Can't use this
    #   trick in the substituted text, so instead, translate < > to { }.
    sed -i -e '/target_include_directories([^)]*$/,/)/ { ;
                    s@\$[{]CMAKE_CURRENT_BINARY_DIR[}]/rosidl_generator_py@& $ENV{PKG_CONFIG_SYSROOT_DIR}/$<CMAKE_INSTALL_PREFIX>/$<PYTHON_INSTALL_DIR>/numpy/core/include@ ;
                    y/<>/{}/ ;
               }' ${D}${datadir}/${ROS_BPN}/cmake/rosidl_generator_py_generate_interfaces.cmake
}
