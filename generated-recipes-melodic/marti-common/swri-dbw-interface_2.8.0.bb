# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides documentation on common interface conventions for     drive-by-wire systems."
AUTHOR = "Marc Alban <malban@swri.org>"
HOMEPAGE = "https://github.com/swri-robotics/marti_common"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "swri_dbw_interface"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
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

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_dbw_interface/2.8.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "21e90133e12363c1cc9efea47549bbdb"
SRC_URI[sha256sum] = "1e3747186a63e5b9d6e0d34de04caa53926f620637766570d6af9fed085fa312"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_dbw_interface-2.8.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/marti-common/marti-common_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/marti-common/marti-common_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/marti-common/marti-common-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/marti-common/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/marti-common/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
