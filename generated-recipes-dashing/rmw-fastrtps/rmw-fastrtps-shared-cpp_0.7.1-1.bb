# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Code shared on static and dynamic type support of rmw_fastrtps_cpp."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
ROS_AUTHOR = "Ricardo González"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rmw_fastrtps"
ROS_BPN = "rmw_fastrtps_shared_cpp"

ROS_BUILD_DEPENDS = " \
    fastcdr \
    fastrtps \
    fastrtps-cmake-module \
    rcpputils \
    rcutils \
    rmw \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
    fastrtps-cmake-module-native \
"

ROS_EXPORT_DEPENDS = " \
    fastcdr \
    fastrtps \
    fastrtps-cmake-module \
    rcpputils \
    rcutils \
    rmw \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/rmw_fastrtps-release/archive/release/dashing/rmw_fastrtps_shared_cpp/0.7.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "43ff9e77c6ca2361fb70e5ee340f0189"
SRC_URI[sha256sum] = "6eab989eca2be10aec2500957c9277a39c28bd7949507914e51c4f13921be3d2"
S = "${WORKDIR}/rmw_fastrtps-release-release-dashing-rmw_fastrtps_shared_cpp-0.7.1-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rmw-fastrtps', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rmw-fastrtps', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rmw-fastrtps/rmw-fastrtps_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rmw-fastrtps/rmw-fastrtps-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rmw-fastrtps/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rmw-fastrtps/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
