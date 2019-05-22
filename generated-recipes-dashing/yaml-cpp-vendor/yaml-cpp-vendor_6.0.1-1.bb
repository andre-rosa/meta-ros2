# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Wrapper around yaml-cpp, it provides a fixed CMake module and an ExternalProject build of it."
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "https://github.com/jbeder/yaml-cpp"
SECTION = "devel"
LICENSE = "Apache-2.0 & MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=f12ef8c0445c08084ae92cf2dcb7ee92"

ROS_CN = "yaml_cpp_vendor"
ROS_BPN = "yaml_cpp_vendor"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/yaml_cpp_vendor-release/archive/release/dashing/yaml_cpp_vendor/6.0.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "498921fbbecb8975f0334fdd265d20ef"
SRC_URI[sha256sum] = "8677db72dad5ef1a587bb1bc260e72cecd4d721cb68d5ed3eb480a083f223d1a"
S = "${WORKDIR}/yaml_cpp_vendor-release-release-dashing-yaml_cpp_vendor-6.0.1-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('yaml-cpp-vendor', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('yaml-cpp-vendor', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/yaml-cpp-vendor/yaml-cpp-vendor_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/yaml-cpp-vendor/yaml-cpp-vendor-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/yaml-cpp-vendor/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/yaml-cpp-vendor/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
