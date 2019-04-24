# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Template based exceptions - these are simple and practical      and avoid the proliferation of exception types. Although not      syntatactically ideal, it is convenient and eminently practical."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/ecl_exceptions"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    ecl-config \
    ecl-errors \
    ecl-license \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ecl-config \
    ecl-errors \
    ecl-license \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ecl-config \
    ecl-errors \
    ecl-license \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/melodic/ecl_exceptions/0.62.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "efa8a730981e89ee843d6af5a3a9dfe7"
SRC_URI[sha256sum] = "41ebe177df444d6184cf296500c419bdac0173c0296d37dfd55110da85216017"
S = "${WORKDIR}/ecl_core-release-release-melodic-ecl_exceptions-0.62.2-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/ecl-core/ecl-core_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/ecl-core/ecl-core_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ecl-core/ecl-core-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ecl-core/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ecl-core/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
