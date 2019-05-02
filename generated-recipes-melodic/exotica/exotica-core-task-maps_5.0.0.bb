# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Common taskmaps provided with EXOTica."
AUTHOR = "Vladimir Ivan <v.ivan@ed.ac.uk>"
HOMEPAGE = "https://github.com/ipab-slmc/exotica"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "exotica_core_task_maps"

ROS_BUILD_DEPENDS = " \
    exotica-core \
    exotica-python \
    geometry-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    exotica-core \
    exotica-python \
    geometry-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    exotica-core \
    exotica-python \
    geometry-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ipab-slmc/exotica-release/archive/release/melodic/exotica_core_task_maps/5.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "015ff0c3ad4614ae030cfcfd37715a88"
SRC_URI[sha256sum] = "3a3613b62c0ad3be115ad5c6214e3ed1d8b55280d5bd7b20555ad4585d3b0b49"
S = "${WORKDIR}/exotica-release-release-melodic-exotica_core_task_maps-5.0.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/exotica/exotica_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/exotica/exotica_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/exotica/exotica-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/exotica/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/exotica/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
