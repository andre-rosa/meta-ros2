# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides the c++ extensions for a variety of threaded       programming tools. These are usually different on different       platforms, so the architecture for a cross-platform framework      is also implemented."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/ecl_threads"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    ecl-build \
    ecl-concepts \
    ecl-config \
    ecl-errors \
    ecl-exceptions \
    ecl-license \
    ecl-time \
    ecl-utilities \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ecl-build \
    ecl-concepts \
    ecl-config \
    ecl-errors \
    ecl-exceptions \
    ecl-license \
    ecl-time \
    ecl-utilities \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ecl-build \
    ecl-concepts \
    ecl-config \
    ecl-errors \
    ecl-exceptions \
    ecl-license \
    ecl-time \
    ecl-utilities \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/melodic/ecl_threads/0.62.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c3583a1d5f8be435e701a775c4765b3a"
SRC_URI[sha256sum] = "ba9d0e01c8f88af99570d7a92b88a2184521c7c4e4622a440a7ab7eea56af380"
S = "${WORKDIR}/ecl_core-release-release-melodic-ecl_threads-0.62.2-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/ecl-core/ecl-core_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/ecl-core/ecl-core_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ecl-core/ecl-core-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ecl-core/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ecl-core/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
