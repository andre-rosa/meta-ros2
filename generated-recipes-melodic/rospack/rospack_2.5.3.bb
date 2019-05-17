# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "ROS Package Tool"
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
ROS_AUTHOR = "Brian Gerkey"
HOMEPAGE = "http://wiki.ros.org/rospack"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rospack"
ROS_BPN = "rospack"

ROS_BUILD_DEPENDS = " \
    boost \
    cmake-modules \
    gtest \
    libtinyxml2 \
    pkgconfig \
    python \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    libtinyxml2 \
    pkgconfig \
    python \
    python-catkin-pkg \
    python-rosdep \
    ros-environment \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    libtinyxml2 \
    pkgconfig \
    python \
    python-catkin-pkg \
    python-rosdep \
    ros-environment \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    python-coverage \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/rospack-release/archive/release/melodic/rospack/2.5.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "dee4f1a984314a61732ea3da5ea27894"
SRC_URI[sha256sum] = "0b9db7d9b7c20d8f36204d3bda08ef5cf41f3f8f7e009862102603b9daf65429"
S = "${WORKDIR}/rospack-release-release-melodic-rospack-2.5.3-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rospack', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rospack', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rospack/rospack_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rospack/rospack-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rospack/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rospack/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
